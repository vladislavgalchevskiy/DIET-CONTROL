// Generated by view binder compiler. Do not edit!
package com.eatingdiary.zwjnevw.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.eatingdiary.zwjnevw.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemFoodBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button addButton;

  @NonNull
  public final CardView addCardview;

  @NonNull
  public final TextView caloriesTextView;

  @NonNull
  public final TextView carbsTextView;

  @NonNull
  public final Button createFood;

  @NonNull
  public final TextView fatTextView;

  @NonNull
  public final RelativeLayout frame74;

  @NonNull
  public final TextView nameFood;

  @NonNull
  public final LinearLayout nutritionLayout;

  @NonNull
  public final RecyclerView productList;

  @NonNull
  public final TextView proteinTextView;

  private ItemFoodBinding(@NonNull LinearLayout rootView, @NonNull Button addButton,
      @NonNull CardView addCardview, @NonNull TextView caloriesTextView,
      @NonNull TextView carbsTextView, @NonNull Button createFood, @NonNull TextView fatTextView,
      @NonNull RelativeLayout frame74, @NonNull TextView nameFood,
      @NonNull LinearLayout nutritionLayout, @NonNull RecyclerView productList,
      @NonNull TextView proteinTextView) {
    this.rootView = rootView;
    this.addButton = addButton;
    this.addCardview = addCardview;
    this.caloriesTextView = caloriesTextView;
    this.carbsTextView = carbsTextView;
    this.createFood = createFood;
    this.fatTextView = fatTextView;
    this.frame74 = frame74;
    this.nameFood = nameFood;
    this.nutritionLayout = nutritionLayout;
    this.productList = productList;
    this.proteinTextView = proteinTextView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemFoodBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemFoodBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_food, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemFoodBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addButton;
      Button addButton = ViewBindings.findChildViewById(rootView, id);
      if (addButton == null) {
        break missingId;
      }

      id = R.id.add_cardview;
      CardView addCardview = ViewBindings.findChildViewById(rootView, id);
      if (addCardview == null) {
        break missingId;
      }

      id = R.id.calories_text_view;
      TextView caloriesTextView = ViewBindings.findChildViewById(rootView, id);
      if (caloriesTextView == null) {
        break missingId;
      }

      id = R.id.carbs_text_view;
      TextView carbsTextView = ViewBindings.findChildViewById(rootView, id);
      if (carbsTextView == null) {
        break missingId;
      }

      id = R.id.create_food;
      Button createFood = ViewBindings.findChildViewById(rootView, id);
      if (createFood == null) {
        break missingId;
      }

      id = R.id.fat_text_view;
      TextView fatTextView = ViewBindings.findChildViewById(rootView, id);
      if (fatTextView == null) {
        break missingId;
      }

      id = R.id.frame_74;
      RelativeLayout frame74 = ViewBindings.findChildViewById(rootView, id);
      if (frame74 == null) {
        break missingId;
      }

      id = R.id.nameFood;
      TextView nameFood = ViewBindings.findChildViewById(rootView, id);
      if (nameFood == null) {
        break missingId;
      }

      LinearLayout nutritionLayout = (LinearLayout) rootView;

      id = R.id.product_list;
      RecyclerView productList = ViewBindings.findChildViewById(rootView, id);
      if (productList == null) {
        break missingId;
      }

      id = R.id.protein_text_view;
      TextView proteinTextView = ViewBindings.findChildViewById(rootView, id);
      if (proteinTextView == null) {
        break missingId;
      }

      return new ItemFoodBinding((LinearLayout) rootView, addButton, addCardview, caloriesTextView,
          carbsTextView, createFood, fatTextView, frame74, nameFood, nutritionLayout, productList,
          proteinTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
