package org.myspecialway.android;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MainScreenActivity extends AppCompatActivity {
    TextView userNameView = (TextView)findViewById(R.id.user_display_name);
    ImageView userAvatarView = (ImageView) findViewById(R.id.user_avatar_image);
    TextView currentScheduleNameView = (TextView)findViewById(R.id.current_schedule_name_text);
    MainScreenViewModel viewModel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        viewModel = ViewModelProviders.of(this).get(MainScreenViewModel.class);
        observeUserName();
        observeUserAvatar();
        observeCurrentScheduleName();
        viewModel.getUserName().setValue("BuchBuch");
    }

    private void observeUserName() {
        final Observer<String> userNameObserver = new Observer<String>() {
            @Override
            public void onChanged(@Nullable final String userName) {
                userNameView.setText(userName);
            }
        };
        viewModel.getUserName().observe(this, userNameObserver);
    }

    private void observeUserAvatar() {
        final Observer<Drawable> userAvatarObserver = new Observer<Drawable>() {
            @Override
            public void onChanged(@Nullable final Drawable userAvatar) {
                userAvatarView.setImageDrawable(userAvatar);
            }
        };
        viewModel.getUserAvatar().observe(this, userAvatarObserver);
    }

    private void observeCurrentScheduleName() {
        final Observer<String> currentScheduleName = new Observer<String>() {
            @Override
            public void onChanged(@Nullable final String currentSchedule) {
                currentScheduleNameView.setText(currentSchedule);
            }
        };
        viewModel.getCurrentSheduleName().observe(this, currentScheduleName);
    }


}
