# PackageID = f(SETTINGS, 
#               OPTIONS,
#               g(PACKAGE_ID_MODE, REQUIREMENTS))
# Why are package id modes important when working with CI/CD flows?
# 1. You want to reuse binaries.
# 2. But also you want to model how changes in the upstream affect your packages.

# The full conan package reference is composed by:
# <name>/<version>@<user>/<channel>#<rrev>:<pkg_id>#<prev>

# For CI/CD 