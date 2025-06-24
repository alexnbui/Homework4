package com.example.informationbook;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class CountriesPagerAdapter extends FragmentStateAdapter {
    private static final int NUM_TABS = 3;
    private String[] titles = {"United Kingdom", "Italy", "France"};
    private int[] imageResIds = {R.drawable.uk_flag, R.drawable.italy_flag, R.drawable.france_flag};
    private String[][] contents = {
            {
                    "Capital: London, Largest City: London, National Language: English, Total Area: 242,495 km², Currency: GBP",
                    "The United States of America (USA), also known as the United States (U.S.) or America, is a country primarily located in North America. It is a federal republic of 50 states and a federal capital district, Washington, D.C., with borders to Canada and Mexico. Its major cities include New York, Los Angeles, and Chicago, and it boasts a population exceeding 340 million"
            },
            {
                    "Capital: Rome, Largest City: Rome, National Language: Italian, Total Area: 301,340 km², Currency: EUR",
                    "Italy, also known as the Italian Republic or Italia, is a country primarily located in Southern Europe. It is a parliamentary republic consisting of 20 regions, with its capital city Rome, and borders France, Switzerland, Austria, and Slovenia to the north. Its major cities include Milan, Venice, and Florence, and it boasts a population exceeding 60 million."
            },
            {
                    "Capital: Paris, Largest City: Paris, National Language: French, Total Area: 643,801 km², Currency: EUR",
                    "France, also known as the French Republic or République Française, is a country primarily located in Western Europe. It is a semi-presidential republic comprising 13 regions, with its capital city Paris, and borders Belgium, Germany, Switzerland, and Italy to the east. Its major cities include Lyon, Marseille, and Toulouse, and it boasts a population exceeding 67 million."
            }
    };

    public CountriesPagerAdapter(FragmentActivity fragmentActivity) {

        super(fragmentActivity);
    }

    @Override
    public Fragment createFragment(int position) {
        // Kết hợp thông tin chính và mô tả
        String combinedContent = contents[position][0] + "\n" + contents[position][1];
        return CountryFragment.newInstance(titles[position], imageResIds[position], combinedContent);
    }

    @Override
    public int getItemCount() {
        return NUM_TABS; // Số lượng tab là 3
    }

    public String[] getTitles() {
        return titles; // Phương thức để lấy mảng titles
    }
}
