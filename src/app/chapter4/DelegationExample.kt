package app.chapter4

class DelegatingCollection<T>(innerList: Collection<T> = ArrayList()) : Collection<T> by innerList