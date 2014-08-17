package nl.changer.questionnaire;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class TestsHolderActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test_container);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new TestIntroFragment())
					.commit();
		}
	}
}