plugins {
  id("kotlin-library-conventions")
}

dependencies {
  implementation(libs.bundles.log4j2.ecosystem)
  implementation(libs.bundles.bouncycastle.ecosystem)
  testImplementation(kotlin("test"))
}

sourceSets {
  main {
    resources {
      srcDir("src/main/certs")
    }
  }
}
