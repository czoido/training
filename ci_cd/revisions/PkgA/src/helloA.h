#pragma once

#ifdef WIN32
  #define HELLOA_EXPORT __declspec(dllexport)
#else
  #define HELLOA_EXPORT
#endif

HELLOA_EXPORT void helloA();
