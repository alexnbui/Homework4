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
                    "The United States of America (USA), also known as the United States (U.S.) or America, is a country primarily located in North America. It is a federal republic of 50 states and a federal capital district, Washington, D.C. The 48 contiguous states border Canada to the north and Mexico to the south, with the semi-exclave of Alaska in the northwest and the archipelago of Hawaii in the Pacific Ocean. The United States also asserts sovereignty over five major island territories and various uninhabited islands in Oceania and the Caribbean.[j] It is a megadiverse country, with the world's third-largest land area[c] and third-largest population, exceeding 340 million.[k]\n" +
                            "\n" +
                            "Paleo-Indians migrated from North Asia to North America over 12,000 years ago, and formed various civilizations and societies. Spanish exploration and colonization led to the establishment in 1513 of Spanish Florida, the first European colony in what is now the continental United States. Subsequent British colonization began with the first settlement of the Thirteen Colonies in Virginia in 1607. Forced migration of enslaved Africans provided the labor force necessary to make the plantation economy of the Southern Colonies economically viable. Clashes with the British Crown over taxation and the denial of parliamentary representation sparked the American Revolution, with the Second Continental Congress formally declaring independence on July 4, 1776. Victory in the 1775–1783 Revolutionary War brought international recognition of U.S. sovereignty, and the country continued to expand westward across North America, resulting in the dispossession of native inhabitants. As more states were admitted, a North–South division over slavery led the Confederate States of America to attempt succession, battling the states loyal to the Union in the 1861–1865 American Civil War. With the victory and preservation of the United States, the newly passed Thirteenth Amendment abolished slavery nationally. By 1900, the country had established itself as a great power, a status solidified after its involvement in World War I. Following Japan's attack on Pearl Harbor in December 1941, the U.S. entered World War II. Its aftermath left the U.S. and the Soviet Union as the world's superpowers and led to the Cold War, during which both countries struggled for ideological dominance and international influence. The Soviet Union's collapse and the end of the Cold War in 1991 left the U.S. as the world's sole superpower."
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
