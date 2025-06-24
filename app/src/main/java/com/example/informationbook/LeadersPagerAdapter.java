package com.example.informationbook;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class LeadersPagerAdapter extends FragmentStateAdapter {
    private static final int NUM_TABS = 3;
    private String[] titles = {"Nelson Mandela", "Cleopatra", "Mahatma Gandhi"};
    private int[] imageResIds = {R.drawable.leader1, R.drawable.leader2, R.drawable.leader3};
    private String[][] contents = {
            {
                    "Born: 18 July 1918, Died: 5 December 2013, Country: South Africa, Role: President",
                    "Nelson Mandela was a South African anti-apartheid revolutionary and politician who served as President of South Africa from 1994 to 1999. He was the country's first Black head of state and the first elected in a fully representative democratic election. His leadership focused on reconciliation and equality."
            },
            {
                    "Born: 69 BC, Died: 30 BC, Country: Egypt, Role: Pharaoh",
                    "Cleopatra VII Philopator was the last active ruler of the Ptolemaic Kingdom of Egypt. A skilled diplomat and linguist, she was known for her political alliances with Roman leaders Julius Caesar and Mark Antony, shaping Egypt's history during her reign."
            },
            {
                    "Born: 2 October 1869, Died: 30 January 1948, Country: India, Role: Leader",
                    "Mahatma Gandhi was an Indian lawyer and anti-colonial nationalist who employed nonviolent resistance to lead the successful campaign for India's independence from British rule. His philosophy of nonviolence inspired movements for civil rights worldwide."
            }
    };

    public LeadersPagerAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @Override
    public Fragment createFragment(int position) {
        String combinedContent = contents[position][0] + "\n" + contents[position][1];
        return LeaderFragment.newInstance(titles[position], imageResIds[position], combinedContent);
    }

    @Override
    public int getItemCount() {
        return NUM_TABS;
    }

    public String[] getTitles() {
        return titles;
    }
}
