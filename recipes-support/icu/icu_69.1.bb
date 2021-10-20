require icu.inc

LIC_FILES_CHKSUM = "file://../LICENSE;md5=002d2fdc32d17f0ec06e9a47f2c0c8d0"

def icu_download_version(d):
    pvsplit = d.getVar('PV').split('.')
    return pvsplit[0] + "_" + pvsplit[1]

ICU_PV = "${@icu_download_version(d)}"

# http://errors.yoctoproject.org/Errors/Details/20486/
ARM_INSTRUCTION_SET_armv4 = "arm"
ARM_INSTRUCTION_SET_armv5 = "arm"

BASE_SRC_URI = "http://download.icu-project.org/files/icu4c/${PV}/icu4c-${ICU_PV}-src.tgz"
SRC_URI = "${BASE_SRC_URI} \
           "

SRC_URI_append_class-target = "\
          "

SRC_URI[md5sum] = "9403db682507369d0f60a25ea67014c4"
SRC_URI[sha256sum] = "4cba7b7acd1d3c42c44bb0c14be6637098c7faf2b330ce876bc5f3b915d09745"

UPSTREAM_CHECK_REGEX = "(?P<pver>\d+(\.\d+)+)/"
UPSTREAM_CHECK_URI = "http://download.icu-project.org/files/icu4c/"
