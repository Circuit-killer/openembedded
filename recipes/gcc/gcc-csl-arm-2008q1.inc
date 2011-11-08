require gcc-common.inc

BINV = "4.2.3"
PV = "4.2.3+csl-arm-2008q1-126"

FILESDIR = "${FILE_DIRNAME}/gcc-csl-arm"

SRC_URI = "http://www.codesourcery.com/public/gnu_toolchain/arm-none-eabi/arm-2008q1-126-arm-none-eabi.src.tar.bz2;name=archive \
           file://gcc41-configure.in.patch \
           file://arm-nolibfloat.patch \
           file://arm-softfloat.patch \
           file://zecke-xgcc-cpp.patch \
"


S = "${WORKDIR}/gcc-4.2"

do_unpack2() {
	cd ${WORKDIR}
	tar -xvjf ./arm-2008q1-126-arm-none-eabi/gcc-2008q1-126.tar.bz2
}

# Language Overrides
FORTRAN = ""
#FORTRAN_linux-gnueabi = ",fortran"
#JAVA = ",java"

EXTRA_OECONF_BASE = "--enable-libssp --disable-bootstrap --disable-libgomp --disable-libmudflap"
EXTRA_OECONF_INITIAL = "--disable-libmudflap --disable-libgomp --disable-libssp --disable-bootstrap"
EXTRA_OECONF_INTERMEDIATE = "--disable-libmudflap --disable-libgomp --disable-libssp --disable-bootstrap"


ARM_INSTRUCTION_SET = "arm"

addtask unpack2 after do_unpack before do_patch

SRC_URI[archive.md5sum] = "be1a8a4baeb745af388f4ce09ff7d3e3"
SRC_URI[archive.sha256sum] = "31ca43436520074e90482f54ffe26cc59ea76836add50d8b7d2c1adfefd19845"
