package com.deliverytech.delivery_api;

public record AppInfo(
    String application,
    String version,
    String developer,
    String javaVersion,
    String framework
) {
}