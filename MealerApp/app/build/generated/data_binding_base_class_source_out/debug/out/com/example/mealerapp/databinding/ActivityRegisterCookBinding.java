// Generated by view binder compiler. Do not edit!
package com.example.mealerapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mealerapp.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterCookBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnRegisterCook;

  @NonNull
  public final Button btnUploadCheque;

  @NonNull
  public final TextInputEditText confirmPassword;

  @NonNull
  public final TextInputEditText enterAddress;

  @NonNull
  public final TextInputEditText enterInfo;

  @NonNull
  public final TextInputEditText enterPassword;

  @NonNull
  public final TextView errorMessageCook;

  @NonNull
  public final TextInputEditText firstName;

  @NonNull
  public final TextInputEditText lastName;

  @NonNull
  public final TextView textView3;

  @NonNull
  public final TextInputEditText userName;

  private ActivityRegisterCookBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnRegisterCook, @NonNull Button btnUploadCheque,
      @NonNull TextInputEditText confirmPassword, @NonNull TextInputEditText enterAddress,
      @NonNull TextInputEditText enterInfo, @NonNull TextInputEditText enterPassword,
      @NonNull TextView errorMessageCook, @NonNull TextInputEditText firstName,
      @NonNull TextInputEditText lastName, @NonNull TextView textView3,
      @NonNull TextInputEditText userName) {
    this.rootView = rootView;
    this.btnRegisterCook = btnRegisterCook;
    this.btnUploadCheque = btnUploadCheque;
    this.confirmPassword = confirmPassword;
    this.enterAddress = enterAddress;
    this.enterInfo = enterInfo;
    this.enterPassword = enterPassword;
    this.errorMessageCook = errorMessageCook;
    this.firstName = firstName;
    this.lastName = lastName;
    this.textView3 = textView3;
    this.userName = userName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterCookBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterCookBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register_cook, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterCookBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_register_cook;
      Button btnRegisterCook = ViewBindings.findChildViewById(rootView, id);
      if (btnRegisterCook == null) {
        break missingId;
      }

      id = R.id.btn_upload_cheque;
      Button btnUploadCheque = ViewBindings.findChildViewById(rootView, id);
      if (btnUploadCheque == null) {
        break missingId;
      }

      id = R.id.confirm_password;
      TextInputEditText confirmPassword = ViewBindings.findChildViewById(rootView, id);
      if (confirmPassword == null) {
        break missingId;
      }

      id = R.id.enter_address;
      TextInputEditText enterAddress = ViewBindings.findChildViewById(rootView, id);
      if (enterAddress == null) {
        break missingId;
      }

      id = R.id.enter_info;
      TextInputEditText enterInfo = ViewBindings.findChildViewById(rootView, id);
      if (enterInfo == null) {
        break missingId;
      }

      id = R.id.enter_password;
      TextInputEditText enterPassword = ViewBindings.findChildViewById(rootView, id);
      if (enterPassword == null) {
        break missingId;
      }

      id = R.id.error_message_cook;
      TextView errorMessageCook = ViewBindings.findChildViewById(rootView, id);
      if (errorMessageCook == null) {
        break missingId;
      }

      id = R.id.first_name;
      TextInputEditText firstName = ViewBindings.findChildViewById(rootView, id);
      if (firstName == null) {
        break missingId;
      }

      id = R.id.last_name;
      TextInputEditText lastName = ViewBindings.findChildViewById(rootView, id);
      if (lastName == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.user_name;
      TextInputEditText userName = ViewBindings.findChildViewById(rootView, id);
      if (userName == null) {
        break missingId;
      }

      return new ActivityRegisterCookBinding((ConstraintLayout) rootView, btnRegisterCook,
          btnUploadCheque, confirmPassword, enterAddress, enterInfo, enterPassword,
          errorMessageCook, firstName, lastName, textView3, userName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
