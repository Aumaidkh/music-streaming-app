package com.implecode.spotify.core

data class Resource<out T>(
    val status: Status,
    val data: T?,
    val message: String?
){

    companion object {
        fun <T> success(data: T?) = Resource(
            status = Status.SUCCESS,
            data = data,
            message = null
        )

        fun <T> error(message: String?) = Resource(
            status = Status.ERROR,
            data = null,
            message = message
        )

        fun <T> loading(data: T?) = Resource(
            status = Status.LOADING,
            data = data,
            message = null
        )
    }

}

enum class Status {
    SUCCESS,
    LOADING,
    ERROR
}