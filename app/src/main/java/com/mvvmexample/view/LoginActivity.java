package com.mvvmexample.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.mvvmexample.R;
import com.mvvmexample.databinding.ActivityLoginBinding;
import com.mvvmexample.model.LoginModel;
import com.mvvmexample.viewmodel.LoginViewModel;

import java.util.List;

/**
 * Created by kedar on 19/03/2018.
 */

public class LoginActivity extends Activity {


    Kedar<LoginModel>  loginModels = new Kedar<>();

    private Activity activity;
    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        activity = this;
        loginModels.add(new LoginModel("kedar","jirel"));
        Log.e("ffsafdsa",loginModels.get(0).getEmail());

        LoginViewModel loginViewModel = new LoginViewModel(activity);
        binding.setLoginData(loginViewModel);

    }

}