package com.example.informationbook;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SevenWondersPagerAdapter extends FragmentStateAdapter {
    private static final int NUM_TABS = 3;
    private String[] titles = {"Great Wall of China", "Taj Mahal", "Machu Picchu"};
    private int[] imageResIds = {R.drawable.sevenwonder1, R.drawable.sevenwonder2, R.drawable.sevenwonder3};
    private String[][] contents = {
            {
                    "Location: Northern China, Built: 221 BC - 1644 AD, Length: 21,196 km",
                    "The Great Wall of China is a series of fortifications made of stone, brick, and earth, built to protect Chinese states from invasions. It is a UNESCO World Heritage Site and a symbol of Chinese ingenuity."
            },
            {
                    "Location: Agra, India, Built: 1632-1653, Architect: Ustad Ahmad Lahauri",
                    "The Taj Mahal is an ivory-white marble mausoleum commissioned by Emperor Shah Jahan for his wife Mumtaz Mahal. It is renowned for its architectural beauty and symmetry."
            },
            {
                    "Location: Cusco Region, Peru, Built: 1450s, Civilization: Inca",
                    "Machu Picchu is a 15th-century Inca citadel located in the Andes Mountains. It is famous for its archaeological significance and stunning mountain scenery."
            }
    };

    public SevenWondersPagerAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity); // Đảm bảo gọi constructor của FragmentStateAdapter
    }

    @Override
    public Fragment createFragment(int position) {
        String combinedContent = contents[position][0] + "\n" + contents[position][1];
        return SevenWonderFragment.newInstance(titles[position], imageResIds[position], combinedContent);
    }

    @Override
    public int getItemCount() {
        return NUM_TABS;
    }

    public String[] getTitles() {
        return titles;
    }
}
