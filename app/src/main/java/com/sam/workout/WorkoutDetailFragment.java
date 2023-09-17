package com.sam.workout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WorkoutDetailFragment extends Fragment {

    private long workoutId;

    public WorkoutDetailFragment() {
    }

    public void setWorkout(long id) {
        this.workoutId = id;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            Workout workout = Workout.workouts[(int) workoutId];

            TextView title = view.findViewById(R.id.textTitle);
            TextView description = view.findViewById(R.id.textDescription);

            title.setText(workout.getName());
            description.setText(workout.getDescription());
        }
    }
}