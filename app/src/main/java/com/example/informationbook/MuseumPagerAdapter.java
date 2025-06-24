package com.example.informationbook;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MuseumPagerAdapter extends FragmentStateAdapter {
    private static final int NUM_TABS = 3;
    private String[] titles = {"Louvre Museum", "British Museum", "Metropolitan Museum of Art"};
    private int[] imageResIds = {R.drawable.museum1, R.drawable.museum2, R.drawable.museum3};
    private String[][] contents = {
            {
                    "Location: Paris, France, Established: 1793, Collection Size: 380,000 objects",
                    "The Louvre Museum, originally a royal palace, is home to the Mona Lisa and Venus de Milo. It attracts millions of visitors annually with its vast collection of art and historical artifacts."
            },
            {
                    "Location: London, UK, Established: 1753, Collection Size: 8 million objects",
                    "The British Museum houses the Rosetta Stone and Egyptian mummies. It is one of the largest and most comprehensive museums in the world, showcasing human history."
            },
            {
                    "Location: New York, USA, Established: 1870, Collection Size: 2 million works",
                    "The Metropolitan Museum of Art, known as The Met, features an extensive collection of art from ancient to modern times, including American and European paintings."
            }
    };

    public MuseumPagerAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity); // Gọi constructor của FragmentStateAdapter
    }

    @Override
    public Fragment createFragment(int position) {
        String combinedContent = contents[position][0] + "\n" + contents[position][1];
        return MuseumFragment.newInstance(titles[position], imageResIds[position], combinedContent);
    }

    @Override
    public int getItemCount() {
        return NUM_TABS;
    }

    public String[] getTitles() {
        return titles;
    }
}
