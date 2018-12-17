package com.shh.dagger2demo.di.scopes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * 实现局部单例
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface LocalScope {
}
