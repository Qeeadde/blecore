package cn.zfs.blelib.event;

import android.support.annotation.NonNull;

/**
 * 使用方法: 在要监听的类中实现接口，并在方法上添加上@Subscribe注解
 * 时间: 2018/9/8 11:58
 * 作者: zengfansheng
 */
public interface IRemoteRssiReadEvent {
    /**
     * onReadRemoteRssi，读取到信息强度
     */
    void onRemoteRssiRead(@NonNull Events.RemoteRssiRead event);
}
