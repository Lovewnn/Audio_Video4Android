#include <jni.h>
#include <string>
#include "lame/lame.h"

extern "C" JNIEXPORT jstring JNICALL
Java_com_lame_mp3encoder_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(get_lame_version());
}
