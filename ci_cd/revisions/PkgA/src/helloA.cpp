#include <iostream>
#include "helloA.h"

void helloA(){
    #ifdef NDEBUG
    std::cout << "Hello PkgA Release!" <<std::endl;
    #else
    std::cout << "Hello PkgA Debug!" <<std::endl;
    #endif
}
