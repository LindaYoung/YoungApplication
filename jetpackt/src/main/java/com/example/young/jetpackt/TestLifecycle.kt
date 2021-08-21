package com.example.young.jetpackt

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 *
 * Lifecycle 直接在android x里，不用额外应用组件
 * 1. 通过 OnLifecycleEvent 注解来关联生命周期
 * 2. 给使用者添加生命周期 getLifecycle().addObserver(testLifecycle);  getLifecycle方法在activity中才有
 * @Author: young
 * @Date: 2021/8/21 14:28
 */
class TestLifecycle() : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun start() {

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stop() {

    }

}