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
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAdminHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnViewComplaints;

  @NonNull
  public final Button logoutButton;

  @NonNull
  public final TextView welcomeMessage;

  private ActivityAdminHomeBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnViewComplaints, @NonNull Button logoutButton,
      @NonNull TextView welcomeMessage) {
    this.rootView = rootView;
    this.btnViewComplaints = btnViewComplaints;
    this.logoutButton = logoutButton;
    this.welcomeMessage = welcomeMessage;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAdminHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAdminHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_admin_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAdminHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_view_complaints;
      Button btnViewComplaints = ViewBindings.findChildViewById(rootView, id);
      if (btnViewComplaints == null) {
        break missingId;
      }

      id = R.id.logout_button;
      Button logoutButton = ViewBindings.findChildViewById(rootView, id);
      if (logoutButton == null) {
        break missingId;
      }

      id = R.id.welcome_message;
      TextView welcomeMessage = ViewBindings.findChildViewById(rootView, id);
      if (welcomeMessage == null) {
        break missingId;
      }

      return new ActivityAdminHomeBinding((ConstraintLayout) rootView, btnViewComplaints,
          logoutButton, welcomeMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
