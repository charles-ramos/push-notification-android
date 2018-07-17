package com.back4app.basicuserregistration;

import com.parse.Parse;
import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.parse.ParseInstallation;
import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;
import com.parse.ParsePush;
import com.parse.SaveCallback;

import java.util.ArrayList;
import java.util.List;


public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
        .applicationId("lOnJ1j6c5OHzz7RFmlXATbEqGvKA3BuT9KXGyWdO")
        .clientKey("fYMc6jNRWTjqBDUJKMn0Tex5x4OBwLT0F9sgObbj")
        .server("https://parseapi.back4app.com/")
                .enableLocalDataStore()
                .build());

        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put("GCMSenderId", "AIzaSyAK8MByAPK5fRP0kLPE4ZSNf-rzm4kaBxM");
        installation.saveInBackground();

    }
}
