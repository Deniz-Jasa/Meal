// Generated by view binder compiler. Do not edit!
package com.example.mealerapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
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

public final class ActivityViewMealsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button addMeal;

  @NonNull
  public final Button goLeft;

  @NonNull
  public final Button goRight;

  @NonNull
  public final ImageView imageComplaint;

  @NonNull
  public final Switch isOffered;

  @NonNull
  public final TextView listComplaints;

  @NonNull
  public final TextView mealFive;

  @NonNull
  public final TextView mealFour;

  @NonNull
  public final TextView mealOne;

  @NonNull
  public final TextView mealThree;

  @NonNull
  public final TextView mealTwo;

  @NonNull
  public final Button removeMeal;

  private ActivityViewMealsBinding(@NonNull ConstraintLayout rootView, @NonNull Button addMeal,
      @NonNull Button goLeft, @NonNull Button goRight, @NonNull ImageView imageComplaint,
      @NonNull Switch isOffered, @NonNull TextView listComplaints, @NonNull TextView mealFive,
      @NonNull TextView mealFour, @NonNull TextView mealOne, @NonNull TextView mealThree,
      @NonNull TextView mealTwo, @NonNull Button removeMeal) {
    this.rootView = rootView;
    this.addMeal = addMeal;
    this.goLeft = goLeft;
    this.goRight = goRight;
    this.imageComplaint = imageComplaint;
    this.isOffered = isOffered;
    this.listComplaints = listComplaints;
    this.mealFive = mealFive;
    this.mealFour = mealFour;
    this.mealOne = mealOne;
    this.mealThree = mealThree;
    this.mealTwo = mealTwo;
    this.removeMeal = removeMeal;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityViewMealsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityViewMealsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_view_meals, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityViewMealsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_meal;
      Button addMeal = ViewBindings.findChildViewById(rootView, id);
      if (addMeal == null) {
        break missingId;
      }

      id = R.id.go_left;
      Button goLeft = ViewBindings.findChildViewById(rootView, id);
      if (goLeft == null) {
        break missingId;
      }

      id = R.id.go_right;
      Button goRight = ViewBindings.findChildViewById(rootView, id);
      if (goRight == null) {
        break missingId;
      }

      id = R.id.imageComplaint;
      ImageView imageComplaint = ViewBindings.findChildViewById(rootView, id);
      if (imageComplaint == null) {
        break missingId;
      }

      id = R.id.isOffered;
      Switch isOffered = ViewBindings.findChildViewById(rootView, id);
      if (isOffered == null) {
        break missingId;
      }

      id = R.id.listComplaints;
      TextView listComplaints = ViewBindings.findChildViewById(rootView, id);
      if (listComplaints == null) {
        break missingId;
      }

      id = R.id.meal_five;
      TextView mealFive = ViewBindings.findChildViewById(rootView, id);
      if (mealFive == null) {
        break missingId;
      }

      id = R.id.meal_four;
      TextView mealFour = ViewBindings.findChildViewById(rootView, id);
      if (mealFour == null) {
        break missingId;
      }

      id = R.id.meal_one;
      TextView mealOne = ViewBindings.findChildViewById(rootView, id);
      if (mealOne == null) {
        break missingId;
      }

      id = R.id.meal_three;
      TextView mealThree = ViewBindings.findChildViewById(rootView, id);
      if (mealThree == null) {
        break missingId;
      }

      id = R.id.meal_two;
      TextView mealTwo = ViewBindings.findChildViewById(rootView, id);
      if (mealTwo == null) {
        break missingId;
      }

      id = R.id.removeMeal;
      Button removeMeal = ViewBindings.findChildViewById(rootView, id);
      if (removeMeal == null) {
        break missingId;
      }

      return new ActivityViewMealsBinding((ConstraintLayout) rootView, addMeal, goLeft, goRight,
          imageComplaint, isOffered, listComplaints, mealFive, mealFour, mealOne, mealThree,
          mealTwo, removeMeal);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
