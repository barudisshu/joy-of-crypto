package info.galudisu.bcFipsIn100.__003_Random_Numbers

import info.galudisu.bcFipsIn100.Nonce
import org.bouncycastle.crypto.fips.FipsDRBG
import org.bouncycastle.crypto.util.BasicEntropySourceProvider
import java.security.SecureRandom

fun buildDrbg(): SecureRandom {
  val entSource = BasicEntropySourceProvider(SecureRandom(), true)
  val drgbBldr =
    FipsDRBG.SHA512_HMAC
      .fromEntropySource(entSource)
      .setSecurityStrength(256)
      .setEntropyBitsRequired(256)
  return drgbBldr.build(Nonce, false)
}
