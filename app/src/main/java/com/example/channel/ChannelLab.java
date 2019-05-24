package com.example.channel;

import java.util.ArrayList;
import java.util.List;

/**
 * 存储视频信息，它在整个应用程序中应该只有一个实例，所以采用单例设计模式来完成。
 */
public class ChannelLab {
    private static ChannelLab instance = null;
    private List<String> channels;

    /**
     * 让构造方法成为私有，避免外部调用
     */
    private ChannelLab() {
        init();
    }

    /**
     * 此方法只会返回同一个实例，不会创建新的实例。
     *
     * @return 单例，表示视频仓库
     */
    public static ChannelLab get() {
        if (null == instance) {
            instance = new ChannelLab();
        }
        return instance;
    }

    /**
     * 返回此仓库中有几部视频。
     *
     * @return 视频数量，整数。
     */
    public int getSize() {
        return channels.size();
    }

    /**
     * 返回指定的视频信息(目的只有名称)
     *
     * @param n 视频的编号，或称为第几部视频
     * @return 视频信息(目前只有名称信息)
     */
    public String getChannel(int n) {
        return channels.get(n);
    }

    /**
     * 初始化一些视频信息用于测试。
     */
    private void init() {
        channels = new ArrayList<>();
        channels.add("CCTV1综合");
        channels.add("CCTV2 财经");
        channels.add("CCTV3综艺");
        channels.add("CCTV4中文国际");
        channels.add("CCTV5体育赛事");
        channels.add("CCTV6电影");
    }
}