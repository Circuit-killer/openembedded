require bug-app.inc

DESCRIPTION = "BUGdash is a web-based admin tool for managing software and viewing settings on BUG. \
More info and screenshots are here: \
'http://community.buglabs.net/akweon/posts/157-User-friendly-admin-tool-for-BUG-BUGdash-':http://community.buglabs.net/akweon/posts/157-User-friendly-admin-tool-for-BUG-BUGdash-\
*UPDATE* Note that the latest version is not compatible with 1.4.2 and below. Upgrade to '1.4.3(BUG Linux download)':http://www.buglabs.net/downloads."
HOMEPAGE = "http://buglabs.net/applications/bugdash"

DEPENDS += "com.buglabs.bug.base  com.buglabs.bug.program com.buglabs.common com.buglabs.nmea com.buglabs.osgi com.buglabs.osgi.cm com.buglabs.osgi.sewing com.sun.javax.servlet com.buglabs.osgi.shell com.sun.javax.servlet service-tracker "

PV = "26"

SRC_LINK = "http://www.buglabs.net/program_version/download/1244"

APIVERSION = "2.0"
