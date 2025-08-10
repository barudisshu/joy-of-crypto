plugins {
  id("kotlin-library-conventions")
}

dependencies {
  implementation(libs.bundles.log4j2.ecosystem)
  testImplementation(kotlin("test"))
}
