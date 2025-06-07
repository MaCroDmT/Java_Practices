/**
  * Creates a [CameraCaptureSession] with a dynamic range profile.
  */
  private setupSessionWithDynamicRangeProfile(
          dynamicRange: Long,
          device: CameraDevice,
          targets: List,
          handler: Handler? = null,
          stateCallback: CameraCaptureSession.StateCallback
  ): Boolean {
      if (android.os.Build.VERSION.SDK_INT >=
              android.os.Build.VERSION_CODES.TIRAMISU) {
          val outputConfigs = mutableListOf()
              for (target in targets) {
                  val outputConfig = OutputConfiguration(target)
                  //sets the dynamic range profile, for example DynamicRangeProfiles.HLG10
                  outputConfig.setDynamicRangeProfile(dynamicRange)
                  outputConfigs.add(outputConfig)
              }


