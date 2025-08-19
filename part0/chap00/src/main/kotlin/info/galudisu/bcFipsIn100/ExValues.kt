package info.galudisu.bcFipsIn100

import org.bouncycastle.util.Strings
import org.bouncycastle.util.encoders.Hex
import javax.crypto.spec.SecretKeySpec

const val THIRTY_DAYS = 1000L * 60 * 60 * 24 * 30
val SampleAesKey = SecretKeySpec(Hex.decode("000102030405060708090a0b0c0d0e0f"), "AES")
val SampleTripleDesKey = SecretKeySpec(Hex.decode("000102030405060708090a0b0c0d0e0f1011121314151617"), "TripleDES")
val SampleHMacKey = SecretKeySpec(Hex.decode("000102030405060708090a0b0c0d0e0f10111213"), "HmacSHA512")
val SampleInput = Strings.toByteArray("Hello World!")
val SampleTwoBlockInput = Strings.toByteArray("Some cipher modes require more than one block")
val Nonce = Strings.toByteArray("number only used once")
val PersonalizationString = Strings.toByteArray("a constant personal marker")
val Initiator = Strings.toByteArray("Initiator")
val Recipient = Strings.toByteArray("Recipient")
val UKM = Strings.toByteArray("User keying material")
