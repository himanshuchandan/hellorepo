release 'H-exp', {
  description = ''
  disableMultipleActiveRuns = '0'
  plannedEndDate = '2021-07-07'
  plannedStartDate = '2021-06-23'
  projectName = 'Training_hchandan'
  timeZone = null

  pipeline 'pipeline_H-exp', {
    disableMultipleActiveRuns = '0'
    disableRestart = '0'
    enabled = '1'
    overrideWorkspace = '0'
    pipelineRunNameTemplate = null
    releaseName = 'H-exp'
    skipStageMode = 'ENABLED'
    templatePipelineName = null
    templatePipelineProjectName = null
    type = null
    workspaceName = null

    formalParameter 'ec_stagesToRun', defaultValue: null, {
      expansionDeferred = '1'
      label = null
      orderIndex = null
      required = '0'
      type = null
    }

    stage 'Stage 1', {
      colorCode = null
      completionType = 'auto'
      condition = null
      duration = null
      parallelToPrevious = null
      pipelineName = 'pipeline_H-exp'
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

      task 'exp', {
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
        resourceName = ''
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
        subpluginKey = 'EC-Git'
        subprocedure = 'Clone'
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
    }
  }
}
