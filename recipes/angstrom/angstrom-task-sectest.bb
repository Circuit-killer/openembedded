DESCRIPTION = "Task packages for the Angstrom distribution"
LICENSE = "MIT"
PR = "r33"

inherit task

RDEPENDS_${PN} = "\
    nmap \
    ettercap-ng \
    stunnel \
    curl \
    prismstumbler \
    kismet \
    hydra \
    miniclipboard"
