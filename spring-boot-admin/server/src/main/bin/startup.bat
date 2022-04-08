@echo off
chcp 65001
echo ...................ccu-utcs开始启动..................
set "JAVA_HOME=C:\Program Files (x86)\Java\jdk1.8.0_111"
if not exist "%JAVA_HOME%\bin\ccu-utcs.exe" copy "%JAVA_HOME%\bin\javaw.exe" "%JAVA_HOME%\bin\ccu-utcs.exe"
start "lock-server" "%JAVA_HOME%\bin\ccu-utcs.exe" -Dfile.encoding=utf-8 -Xmx1024M -Xms512M -classpath .;..\lib\* com.ehualu.eloc.utcs.UtcsApplication
echo ...................ccu-utcs启动结束..................
echo 按任意键关闭窗口 & pause>nul