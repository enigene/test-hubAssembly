#
# Installing UCSC-BLAT with the CHM13.chrX 2bit-file
# http://hgdownload.cse.ucsc.edu/admin/exe/linux.x86_64/blat/
# Please note that the Blat source and executables are freely available for
# academic, nonprofit and personal use. Commercial licensing information is
# available on the Kent Informatics website (http://www.kentinformatics.com/).
#
# version 0.1


FROM ubuntu:14.04
MAINTAINER URALSKY, Lev <uralsky@rogaevlab.ru>

RUN apt-get update
RUN apt-get -y install wget
RUN mkdir -p /opt/BLAT
RUN wget --timestamping 'https://raw.githubusercontent.com/enigene/test-hubAssembly/master/CHM13.chrX_v0.7/chm13.chrX_v0.7.2bit' -P /opt/BLAT
RUN wget http://hgdownload.cse.ucsc.edu/admin/exe/linux.x86_64/blat/blat -P /opt/BLAT
RUN chmod a+x /opt/BLAT/blat
RUN wget http://hgdownload.cse.ucsc.edu/admin/exe/linux.x86_64/blat/gfClient -P /opt/BLAT
RUN chmod a+x /opt/BLAT/gfClient
RUN wget http://hgdownload.cse.ucsc.edu/admin/exe/linux.x86_64/blat/gfServer -P /opt/BLAT
RUN chmod a+x /opt/BLAT/gfServer
RUN apt-get -y install libkrb5-3

CMD /opt/BLAT/gfServer start localhost 17879 -stepSize=5 /opt/BLAT/chm13.chrX_v0.7.2bit -canStop &
CMD /opt/BLAT/gfServer start localhost 17878 -trans -mask /opt/BLAT/chm13.chrX_v0.7.2bit -canStop &
