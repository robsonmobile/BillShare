package net.paulacr.billshare;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import net.paulacr.billshare.main.BillShareInterface;
import net.paulacr.billshare.main.BillSharePresenter;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements BillShareInterface.View, View.OnClickListener {

    private BillSharePresenter presenter;

    @Bind(R.id.toolbar)
    Toolbar toolbar;

    @Bind(R.id.peopleNumberSpinner)
    Spinner numberOfPeople;

    @Bind(R.id.totalValueTextInputLayout)
    TextInputLayout totalValueHint;

    @Bind(R.id.alreadyPaidTextInputLayout)
    TextInputLayout alreadyPaidValueHint;

    @Bind(R.id.taxValueTextInputLayout)
    TextInputLayout taxValueHint;

    @Bind(R.id.totalValueField)
    EditText totalValueField;

    @Bind(R.id.alreadyPaidValueField)
    EditText alreadyPaidField;

    @Bind(R.id.taxValueField)
    EditText taxValueField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupButterknife();
        setupViews();
        setupPresenter();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void setupButterknife() {
        ButterKnife.bind(this);
    }

    @Override
    public void setupViews() {
        setSupportActionBar(toolbar);
        createNumberOfPeopleAdapter();
        //fab.setOnClickListener(this);


    }

    private void createNumberOfPeopleAdapter() {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.numberOfPeopleArray, android.R.layout.simple_spinner_dropdown_item);
        numberOfPeople.setAdapter(adapter);
    }

    @Override
    public void setupPresenter() {
        presenter = new BillSharePresenter(this, this);
    }

    @Override
    public void showSharedValue(String sharedValue) {

    }

    @Override
    public void setFieldErrors(TextInputLayout textInputLayout, String message) {
        textInputLayout.setError(message);
    }

    @Override
    public void cleanFieldErrors(TextInputLayout textInputLayout) {
        textInputLayout.setError(null);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

        }

    }

}
