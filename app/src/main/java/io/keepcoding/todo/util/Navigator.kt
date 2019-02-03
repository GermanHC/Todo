package com.germanhc.todo.util

import android.content.Context
import android.content.Intent
import androidx.fragment.app.FragmentManager
import com.germanhc.todo.data.model.Task
import com.germanhc.todo.ui.edittask.EditTaskFragment
import com.germanhc.todo.ui.newtask.NewTaskActivity

object Navigator {

    fun navigateToNewTaskActivity(context: Context) {
        val intent = Intent(context, NewTaskActivity::class.java)
        context.startActivity(intent)
    }

    fun navigateToEditTaskFragment(task: Task, fragmentManager: FragmentManager) {
        val fragment = EditTaskFragment.newInstance(task)
        fragment.show(fragmentManager, null)
    }

}