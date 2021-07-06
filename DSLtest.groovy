pipeline 'First-pipe', {
  disableMultipleActiveRuns = '0'
  disableRestart = '0'
  enabled = '1'
  overrideWorkspace = '0'
  pipelineRunNameTemplate = null
  projectName = 'hchandan'
  releaseName = null
  skipStageMode = 'ENABLED'
  templatePipelineName = null
  templatePipelineProjectName = null
  type = null
  workspaceName = null

  formalParameter 'version', defaultValue: '1.0.0', {
    expansionDeferred = '0'
    label = 'Application Version'
    orderIndex = '1'
    required = '1'
    type = 'entry'
  }

  formalParameter 'ec_stagesToRun', defaultValue: null, {
    expansionDeferred = '1'
    label = null
    orderIndex = null
    required = '0'
    type = null
  }

  stage 'DEV', {
    description = 'first stage - for DEV deployment'
    colorCode = null
    completionType = 'auto'
    condition = null
    duration = null
    parallelToPrevious = null
    pipelineName = 'First-pipe'
    plannedEndDate = null
    plannedStartDate = null
    precondition = null
    resourceName = null
    waitForPlannedStartDate = '0'

    gate 'PRE', {
      condition = null
      precondition = null
      }

    gate 'POST', {
      condition = null
      precondition = null
      task 'devApproval', {
        description = null
        actionLabelText = null
        advancedMode = '0'
        afterLastRetry = null
        allowOutOfOrderRun = '0'
        allowSkip = null
        alwaysRun = '0'
        ciConfigurationName = null
        ciControllerFolder = null
        ciControllerName = null
        ciJobBranchName = null
        ciJobFolder = null
        ciJobName = null
        condition = null
        customLabel = null
        deployerExpression = null
        deployerRunType = null
        disableFailure = null
        duration = null
        emailConfigName = null
        enabled = '1'
        environmentName = null
        environmentProjectName = null
        environmentTemplateName = null
        environmentTemplateProjectName = null
        errorHandling = 'stopOnError'
        gateCondition = null
        gateType = 'POST'
        groupName = null
        groupRunType = null
        insertRollingDeployManualStep = '0'
        instruction = null
        notificationEnabled = '1'
        notificationTemplate = 'ec_default_pipeline_notification_template'
        parallelToPrevious = null
        plannedEndDate = null
        plannedStartDate = null
        precondition = null
        requiredApprovalsCount = null
        resourceName = null
        retryCount = null
        retryInterval = null
        retryType = null
        rollingDeployEnabled = null
        rollingDeployManualStepCondition = null
        skippable = '0'
        snapshotName = null
        stageSummaryParameters = null
        startingStage = null
        subErrorHandling = null
        subapplication = null
        subpipeline = null
        subpluginKey = null
        subprocedure = null
        subprocess = null
        subproject = 'hchandan'
        subrelease = null
        subreleasePipeline = null
        subreleasePipelineProject = null
        subreleaseSuffix = null
        subservice = null
        subworkflowDefinition = null
        subworkflowStartingState = null
        taskProcessType = null
        taskType = 'APPROVAL'
        triggerType = null
        useApproverAcl = '0'
        waitForPlannedStartDate = '0'
        approver = [
          'hchandan',
          'admin',
        ]
      }
    }

    task 'pullJIRATickets', {
      description = null
      actionLabelText = null
      actualParameter = [
        'config': 'jira',
        'createLink': '1',
        'jql': 'project = PM',
        'resultFormat': 'propertySheet',
        'resultProperty': '/myJob/getIssuesResult',
      ]
      advancedMode = '0'
      afterLastRetry = null
      allowOutOfOrderRun = '0'
      allowSkip = null
      alwaysRun = '0'
      ciConfigurationName = null
      ciControllerFolder = null
      ciControllerName = null
      ciJobBranchName = null
      ciJobFolder = null
      ciJobName = null
      condition = null
      customLabel = null
      deployerExpression = null
      deployerRunType = null
      disableFailure = null
      duration = null
      emailConfigName = null
      enabled = '1'
      environmentName = null
      environmentProjectName = null
      environmentTemplateName = null
      environmentTemplateProjectName = null
      errorHandling = 'stopOnError'
      gateCondition = null
      gateType = null
      groupName = null
      groupRunType = null
      insertRollingDeployManualStep = '0'
      instruction = null
      notificationEnabled = null
      notificationTemplate = null
      parallelToPrevious = null
      plannedEndDate = null
      plannedStartDate = null
      precondition = null
      requiredApprovalsCount = null
      resourceName = null
      retryCount = null
      retryInterval = null
      retryType = null
      rollingDeployEnabled = null
      rollingDeployManualStepCondition = null
      skippable = '0'
      snapshotName = null
      stageSummaryParameters = null
      startingStage = null
      subErrorHandling = null
      subapplication = null
      subpipeline = null
      subpluginKey = 'EC-JIRA'
      subprocedure = 'GetIssues'
      subprocess = null
      subproject = null
      subrelease = null
      subreleasePipeline = null
      subreleasePipelineProject = null
      subreleaseSuffix = null
      subservice = null
      subworkflowDefinition = null
      subworkflowStartingState = null
      taskProcessType = null
      taskType = 'PLUGIN'
      triggerType = null
      useApproverAcl = '0'
      waitForPlannedStartDate = '0'
    }

    task 'devDeployment', {
      description = 'deployment to DEV'
      actionLabelText = null
      actualParameter = [
        'ec_smartDeployOption': '0',
        'ec_stageArtifacts': '1',
        'jiraNumber': '12345',
      ]
      advancedMode = '0'
      afterLastRetry = null
      allowOutOfOrderRun = '0'
      allowSkip = null
      alwaysRun = '0'
      ciConfigurationName = null
      ciControllerFolder = null
      ciControllerName = null
      ciJobBranchName = null
      ciJobFolder = null
      ciJobName = null
      condition = null
      customLabel = null
      deployerExpression = null
      deployerRunType = null
      disableFailure = null
      duration = null
      emailConfigName = null
      enabled = '1'
      environmentName = 'hchandan_DEV_basicTraining'
      environmentProjectName = 'hchandan'
      environmentTemplateName = null
      environmentTemplateProjectName = null
      errorHandling = 'stopOnError'
      gateCondition = null
      gateType = null
      groupName = null
      groupRunType = null
      insertRollingDeployManualStep = '0'
      instruction = null
      notificationEnabled = null
      notificationTemplate = null
      parallelToPrevious = null
      plannedEndDate = null
      plannedStartDate = null
      precondition = null
      requiredApprovalsCount = null
      resourceName = null
      retryCount = null
      retryInterval = null
      retryType = null
      rollingDeployEnabled = null
      rollingDeployManualStepCondition = null
      skippable = '0'
      snapshotName = null
      stageSummaryParameters = null
      startingStage = null
      subErrorHandling = null
      subapplication = 'H-app'
      subpipeline = null
      subpluginKey = null
      subprocedure = null
      subprocess = 'DeployApplication'
      subproject = 'hchandan'
      subrelease = null
      subreleasePipeline = null
      subreleasePipelineProject = null
      subreleaseSuffix = null
      subservice = null
      subworkflowDefinition = null
      subworkflowStartingState = null
      taskProcessType = 'APPLICATION'
      taskType = 'PROCESS'
      triggerType = null
      useApproverAcl = '0'
      waitForPlannedStartDate = '0'
    }
  }

  stage 'QA', {
    description = 'second stage - for QA deployment'
    colorCode = null
    completionType = 'auto'
    condition = null
    duration = null
    parallelToPrevious = null
    pipelineName = 'First-pipe'
    plannedEndDate = null
    plannedStartDate = null
    precondition = null
    resourceName = null
    waitForPlannedStartDate = '0'

    gate 'PRE', {
      condition = null
      precondition = null
      }

    gate 'POST', {
      condition = null
      precondition = null
      task 'testPassed', {
        description = null
        actionLabelText = null
        advancedMode = '0'
        afterLastRetry = null
        allowOutOfOrderRun = '0'
        allowSkip = null
        alwaysRun = '0'
        ciConfigurationName = null
        ciControllerFolder = null
        ciControllerName = null
        ciJobBranchName = null
        ciJobFolder = null
        ciJobName = null
        condition = null
        customLabel = null
        deployerExpression = null
        deployerRunType = null
        disableFailure = null
        duration = null
        emailConfigName = null
        enabled = '1'
        environmentName = null
        environmentProjectName = null
        environmentTemplateName = null
        environmentTemplateProjectName = null
        errorHandling = 'stopOnError'
        gateCondition = '$[/javascript myPipelineStageRuntime.percentPassed > 90 ]'
        gateType = 'POST'
        groupName = null
        groupRunType = null
        insertRollingDeployManualStep = '0'
        instruction = null
        notificationEnabled = null
        notificationTemplate = null
        parallelToPrevious = null
        plannedEndDate = null
        plannedStartDate = null
        precondition = null
        requiredApprovalsCount = null
        resourceName = null
        retryCount = null
        retryInterval = null
        retryType = null
        rollingDeployEnabled = null
        rollingDeployManualStepCondition = null
        skippable = '0'
        snapshotName = null
        stageSummaryParameters = null
        startingStage = null
        subErrorHandling = null
        subapplication = null
        subpipeline = null
        subpluginKey = null
        subprocedure = null
        subprocess = null
        subproject = 'hchandan'
        subrelease = null
        subreleasePipeline = null
        subreleasePipelineProject = null
        subreleaseSuffix = null
        subservice = null
        subworkflowDefinition = null
        subworkflowStartingState = null
        taskProcessType = null
        taskType = 'CONDITIONAL'
        triggerType = null
        useApproverAcl = '0'
        waitForPlannedStartDate = '0'
      }
    }

    task 'QADeployment', {
      description = 'deployment to QA'
      actionLabelText = null
      actualParameter = [
        'ec_smartDeployOption': '0',
        'ec_stageArtifacts': '1',
        'jiraNumber': '12345',
      ]
      advancedMode = '0'
      afterLastRetry = null
      allowOutOfOrderRun = '0'
      allowSkip = null
      alwaysRun = '0'
      ciConfigurationName = null
      ciControllerFolder = null
      ciControllerName = null
      ciJobBranchName = null
      ciJobFolder = null
      ciJobName = null
      condition = null
      customLabel = null
      deployerExpression = null
      deployerRunType = null
      disableFailure = null
      duration = null
      emailConfigName = null
      enabled = '1'
      environmentName = 'hchandan_QA_basicTraining'
      environmentProjectName = 'hchandan'
      environmentTemplateName = null
      environmentTemplateProjectName = null
      errorHandling = 'stopOnError'
      gateCondition = null
      gateType = null
      groupName = null
      groupRunType = null
      insertRollingDeployManualStep = '0'
      instruction = null
      notificationEnabled = null
      notificationTemplate = null
      parallelToPrevious = null
      plannedEndDate = null
      plannedStartDate = null
      precondition = null
      requiredApprovalsCount = null
      resourceName = null
      retryCount = null
      retryInterval = null
      retryType = null
      rollingDeployEnabled = null
      rollingDeployManualStepCondition = null
      skippable = '0'
      snapshotName = null
      stageSummaryParameters = null
      startingStage = null
      subErrorHandling = null
      subapplication = 'H-app'
      subpipeline = null
      subpluginKey = null
      subprocedure = null
      subprocess = 'DeployApplication'
      subproject = 'hchandan'
      subrelease = null
      subreleasePipeline = null
      subreleasePipelineProject = null
      subreleaseSuffix = null
      subservice = null
      subworkflowDefinition = null
      subworkflowStartingState = null
      taskProcessType = 'APPLICATION'
      taskType = 'PROCESS'
      triggerType = null
      useApproverAcl = '0'
      waitForPlannedStartDate = '0'
    }

    task 'runFunctionalTests', {
      description = null
      actionLabelText = null
      actualParameter = [
        'commandToRun': 'ectool setProperty "/myPipelineStageRuntime/percentPassed" "96"',
      ]
      advancedMode = '0'
      afterLastRetry = null
      allowOutOfOrderRun = '0'
      allowSkip = null
      alwaysRun = '0'
      ciConfigurationName = null
      ciControllerFolder = null
      ciControllerName = null
      ciJobBranchName = null
      ciJobFolder = null
      ciJobName = null
      condition = null
      customLabel = null
      deployerExpression = null
      deployerRunType = null
      disableFailure = null
      duration = null
      emailConfigName = null
      enabled = '1'
      environmentName = null
      environmentProjectName = null
      environmentTemplateName = null
      environmentTemplateProjectName = null
      errorHandling = 'stopOnError'
      gateCondition = null
      gateType = null
      groupName = null
      groupRunType = null
      insertRollingDeployManualStep = '0'
      instruction = null
      notificationEnabled = null
      notificationTemplate = null
      parallelToPrevious = null
      plannedEndDate = null
      plannedStartDate = null
      precondition = null
      requiredApprovalsCount = null
      resourceName = null
      retryCount = null
      retryInterval = null
      retryType = null
      rollingDeployEnabled = null
      rollingDeployManualStepCondition = null
      skippable = '0'
      snapshotName = null
      stageSummaryParameters = null
      startingStage = null
      subErrorHandling = null
      subapplication = null
      subpipeline = null
      subpluginKey = 'EC-Core'
      subprocedure = 'RunCommand'
      subprocess = null
      subproject = null
      subrelease = null
      subreleasePipeline = null
      subreleasePipelineProject = null
      subreleaseSuffix = null
      subservice = null
      subworkflowDefinition = null
      subworkflowStartingState = null
      taskProcessType = null
      taskType = 'COMMAND'
      triggerType = null
      useApproverAcl = '0'
      waitForPlannedStartDate = '0'
    }
  }

  stage 'PROD', {
    colorCode = null
    completionType = 'auto'
    condition = null
    duration = null
    parallelToPrevious = null
    pipelineName = 'First-pipe'
    plannedEndDate = null
    plannedStartDate = null
    precondition = null
    resourceName = null
    waitForPlannedStartDate = '0'

    gate 'PRE', {
      condition = null
      precondition = null
      }

    gate 'POST', {
      condition = null
      precondition = null
      }
  }
}
