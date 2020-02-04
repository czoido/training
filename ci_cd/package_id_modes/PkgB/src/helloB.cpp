#include <iostream>
#include "helloB.h"
#include "helloA.h"

void helloB(){
    helloA();
    #ifdef NDEBUG
    std::cout << "Hello PkgB Release!" <<std::endl;
    #else
    std::cout << "Hello PkgB Debug!" <<std::endl;
    #endif
}
