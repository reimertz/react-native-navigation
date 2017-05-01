package com.reactnativenavigation.viewcontrollers;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.view.View;

public abstract class ViewController {
	private View view;
	private final Activity activity;
	private StackController stackController;

	public ViewController(Activity activity) {
		this.activity = activity;
	}

	protected abstract View createView();

	public boolean handleBack() {
		return false;
	}

	public Activity getActivity() {
		return activity;
	}

	@Nullable
	public StackController getStackController() {
		return stackController;
	}

	void setStackController(final StackController stackController) {
		this.stackController = stackController;
	}

	public View getView() {
		if (view == null) {
			view = createView();
			onCreate();
		}
		return view;
	}

	public void onCreate() {

	}

	public void onStart() {

	}

	public void onStop() {

	}

	public void onDestroy() {

	}

}