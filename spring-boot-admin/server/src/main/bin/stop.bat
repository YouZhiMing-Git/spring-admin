@echo off
chcp 65001
echo ...................ccu-utcs开始关闭服务..................
taskkill -f -t -im ccu-utcs.exe
echo ...................ccu-utcs关闭服务结束..................
echo 按任意键关闭窗口 & pause>nul