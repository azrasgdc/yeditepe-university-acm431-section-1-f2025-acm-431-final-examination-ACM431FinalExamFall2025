package com.yeditepe.finalexam.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.yeditepe.finalexam.model.Task
import com.yeditepe.finalexam.viewmodel.TaskViewModel

@Composable
fun TaskListScreen(viewModel: TaskViewModel = viewModel()) {

    // TODO 3: Read task list from ViewModel
    val tasks = viewModel.taskList

        // TODO 4: Display task titles and completion status
        Column {
                tasks.forEach { task ->
                    TaskRow(
                        task = task, navController = NavController
                    )
                }
            }
        }

    @Composable
    fun TaskRow(task: Task, navController: NavController) {

        Text(
            text = task.title,
            modifier = Modifier.clickable {
                // TODO 3: Navigate to detail screen with task title
                navController.navigate("taskDetail/${task.title}")
            }
        )
    }

