package nl.changer.questionnaire;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TestIntroFragment extends Fragment {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		
		View ui = inflater.inflate(R.layout.test_intro, null);
		
		return ui;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		showDescription();
		showQuestionCount();
		showEstimatedTime();
	}

	private void showDescription() {
		// TODO:
	}

	private void showEstimatedTime() {
		// TODO:
	}

	private void showQuestionCount() {
		// TODO:
	}
}
