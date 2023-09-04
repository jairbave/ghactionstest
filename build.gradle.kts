 // Top-level build file where you can add configuration options common to all sub-projects/modules.

 buildscript{
     dependencies{
         classpath ("com.google.firebase:firebase-bom:32.2.3")
     }
 }

 plugins {
    id("com.android.application") version "8.1.0" apply false
}