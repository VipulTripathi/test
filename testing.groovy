xlr {
  release('Empty') {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2020-05-07T09:00:00+0530')
    phases {
      phase('New Phase') {
        
      }
    }
    teams {
      team('Release Admin') {
        permissions 'release#edit_precondition', 'release#edit', 'release#task_transition', 'release#edit_task_attachments', 'trigger#view_trigger', 'release#reassign_task', 'release#edit_task_input_output_properties', 'release#edit_task_tags', 'release#edit_security', 'release#edit_task_description', 'trigger#edit_trigger', 'release#view', 'release#lock_task', 'release#start', 'release#edit_blackout', 'template#view', 'release#edit_failure_handler', 'release#abort', 'release#edit_task_script', 'release#edit_task_configuration_facet', 'release#edit_task_flag', 'release#edit_task_dates', 'release#edit_task'
      }
      team('Template Owner') {
        members 'admin'
        permissions 'template#edit', 'template#lock_task', 'template#view', 'template#edit_triggers', 'template#edit_precondition', 'template#edit_security', 'template#create_release', 'template#edit_failure_handler'
      }
    }
  }
}
