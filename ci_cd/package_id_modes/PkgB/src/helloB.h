#pragma once

#ifdef WIN32
  #define HELLOB_EXPORT __declspec(dllexport)
#else
  #define HELLOB_EXPORT
#endif

HELLOB_EXPORT void helloB();
