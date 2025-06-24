package com.example.informationbook;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class CountryFragment extends Fragment {
    private static final String ARG_TITLE = "title";
    private static final String ARG_IMAGE = "image";
    private static final String ARG_CONTENT = "content";

    private String title;
    private int imageResId;
    private String content;

    public static CountryFragment newInstance(String title, int imageResId, String content) {
        CountryFragment fragment = new CountryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TITLE, title);
        args.putInt(ARG_IMAGE, imageResId);
        args.putString(ARG_CONTENT, content);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_country, container, false);
        ImageView imageView = view.findViewById(R.id.countryImage);
        TextView titleText = view.findViewById(R.id.countryTitle);
        TextView contentText = view.findViewById(R.id.countryContent);

        if (getArguments() != null) {
            title = getArguments().getString(ARG_TITLE);
            imageResId = getArguments().getInt(ARG_IMAGE);
            content = getArguments().getString(ARG_CONTENT);
        }

        titleText.setText(title);
        titleText.setTextAppearance(requireContext(), androidx.appcompat.R.style.TextAppearance_AppCompat_Headline);

        SpannableString spannableContent = new SpannableString(content);
        int boldStart = content.indexOf(title);
        if (boldStart >= 0) {
            spannableContent.setSpan(new StyleSpan(android.graphics.Typeface.BOLD), boldStart, boldStart + title.length(), SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        contentText.setText(spannableContent);
        contentText.setMaxLines(Integer.MAX_VALUE); // Đảm bảo hiển thị toàn bộ nội dung

        imageView.setImageResource(imageResId);
        return view;
    }
}
