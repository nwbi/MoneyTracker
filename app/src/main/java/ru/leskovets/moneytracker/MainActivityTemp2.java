package ru.leskovets.moneytracker;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityTemp2 extends AppCompatActivity {


    TextView add;
    EditText name;
    EditText number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        final ViewPager pages = (ViewPager) findViewById(R.id.pages);
        //setContentView(R.layout.items);
        //add = (TextView) findViewById(R.id.add);
        //name = (EditText) findViewById(R.id.name);
        //number = (EditText) findViewById(R.id.price);
        //final RecyclerView items = (RecyclerView) findViewById(R.id.items);
        //items.setAdapter(new ItemsAdapter());
        pages.setAdapter(new MainPagerAdapter());
        tabs.setupWithViewPager(pages);


//        TextWatcher watcher = new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                add.setEnabled(!TextUtils.isEmpty(name.getText().toString().trim()) && !TextUtils.isEmpty(number.getText().toString().trim()));
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
//            }
//
//        };
//
//        name.addTextChangedListener(watcher);
//        number.addTextChangedListener(watcher);
    }

//

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    private class MainPagerAdapter extends FragmentPagerAdapter {
        private final String[] titles;

        MainPagerAdapter() {
            super(getSupportFragmentManager());
            titles = getResources().getStringArray(R.array.main_pager_titles);
        }

        @Override
        public Fragment getItem(int position) {
            final ItemsFragment fragment = new ItemsFragment();
            Bundle args = new Bundle();

            switch (position) {
                case 0:
                    args.putString(ItemsFragment.ARG_TYPE, Item.TYPE_EXPENSE);
                    fragment.setArguments(args);
                    return fragment;
                case 1:
                    args.putString(ItemsFragment.ARG_TYPE, Item.TYPE_INCOME);
                    fragment.setArguments(args);
                    return fragment;
                case 2:
                    return new BalanceFragment();
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return titles.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }
    }
}

//        ItemsAdapter() {
//            items.add(new Item("milk Prostokvashino 3,2%", 60, Item.TYPE_EXPENSE));
//            items.add(new Item("apple", 50, Item.TYPE_EXPENSE));
//            items.add(new Item("fun maker", 100, Item.TYPE_EXPENSE));
//            items.add(new Item("lemon 1 kg", 40, Item.TYPE_EXPENSE));
//            items.add(new Item("fruits 3 kg", 1000, Item.TYPE_EXPENSE));
//            items.add(new Item("red fish", 670, Item.TYPE_EXPENSE));
//            items.add(new Item("bread", 50, Item.TYPE_EXPENSE));
//            items.add(new Item("rice 1 sht.", , Item.TYPE_EXPENSE));
//            items.add(new Item("icecream Korovka", 58, Item.TYPE_EXPENSE));
//            items.add(new Item("gun", 4550, Item.TYPE_EXPENSE));
//            items.add(new Item("car Lada Granda, red color", 100000, Item.TYPE_EXPENSE));
//            items.add(new Item("juice", 50, Item.TYPE_EXPENSE));
//            items.add(new Item("mouse", 750, Item.TYPE_EXPENSE));
//            items.add(new Item("android super smartfon Lenovo K5 Vibe", 4550, Item.TYPE_EXPENSE));
//        }