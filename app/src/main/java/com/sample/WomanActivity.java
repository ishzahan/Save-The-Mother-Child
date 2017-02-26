package com.sample;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by User on 1/30/2017.
 */

public class WomanActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_woman);
    ButterKnife.bind(this);
  }

  @Override public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.options_menu, menu);

    // Associate searchable configuration with the SearchView
    /*SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
    SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
    searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));*/

    return true;
  }


  @OnClick(R.id.date_status) public void dateStatus() {
    Intent intent = new Intent(this, DateStatusActivity.class);
    startActivity(intent);
  }
  @OnClick(R.id.weight_status) public void weightStatus() {
    Intent intent = new Intent(this, WeightStatusActivity.class);
    startActivity(intent);
  }
  @OnClick(R.id.week_info) public void weekInfo() {
    Intent intent = new Intent(this, WeekInfoActivity.class);
    startActivity(intent);
  }
  @OnClick(R.id.baby_info) public void babyThisWeek() {
    Intent intent = new Intent(this, ThisWeekActivity.class);
    startActivity(intent);
  }
  @OnClick(R.id.daily_tips) public void dailyTips() {
    Intent intent = new Intent(this, DailyTipsActivity.class);
    startActivity(intent);
  }
  @OnClick(R.id.reminder_set) public void reminder() {
    Intent intent = new Intent(this, NotificationActivity.class);
    startActivity(intent);
  }
  @OnClick(R.id.others) public void other() {
    Intent intent = new Intent(this, OtherActivity.class);
    startActivity(intent);
  }
}
