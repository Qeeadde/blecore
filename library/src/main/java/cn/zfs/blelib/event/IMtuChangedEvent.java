package cn.zfs.blelib.event;

/**
 * 使用方法: 在要监听的类中实现接口，并在方法上添加上@Subscribe注解
 * 时间: 2018/9/8 11:58
 * 作者: zengfansheng
 */
public interface IMtuChangedEvent {    
    /**
     * onMtuChanged，MTU修改成功
     */
    void onMtuChanged(Events.MtuChanged event);
}
