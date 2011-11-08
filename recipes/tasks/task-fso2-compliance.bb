DESCRIPTION = "The freesmartphone.org Framework 2.0. \
Install this task to make your distribution FSO 2.0-compliant."
SECTION = "fso/base"
LICENSE = "MIT"
PV = "1.9.0"
PR = "r9"

inherit task

RDEPENDS_${PN} = "\
  libfsobasics \
  libfsotransport \
  libfsoframework \
  libfsoresource \
  \
  fsodatad \
  fsodeviced \
  fsogsmd \
  fsotdld \
  fsonetworkd \
  fsousaged \
  fsoaudiod \
  \
  fso-apm \
"

RRECOMMENDS_${PN} = "\
  wmiconfig \
  tzdata \
  tzdata-africa \
  tzdata-americas \
  tzdata-asia \
  tzdata-australia \
  tzdata-europe \
"
