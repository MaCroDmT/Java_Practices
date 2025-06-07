private fun isTenBitProfileSupported(cameraId: String): Boolean {
  val cameraCharacteristics = cameraManager.getCameraCharacteristics(cameraId)
  val availableCapabilities = cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES)
  for (capability in availableCapabilities!!) {
      if (capability == CameraMetadata.REQUEST_AVAILABLE_CAPABILITIES_DYNAMIC_RANGE_TEN_BIT) {
          return true
      }
  }
  return false
}
