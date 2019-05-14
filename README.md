# 线程池在springMvc中的使用
## 1 配置及说明：配置文件中有详细注释
## 2 任务提交给线程池之后的处理流程
### 2.1 若count<corePoolSize,则没来一个任务，就创建一个线程直接执行
### 2.2 若count>=corePoolSize,则没来一个任务，则尝试将其放入任务缓存队列(BlockingQueue)中。若添加成功，则该任务会等待
        空闲线程去取出并执行；若添加失败（多半是队列已满），则会尝试创建新的线程去执行这个任务
### 2.3 若count=maximumPoolSize且还有任务进入时，会采取任务拒绝策略进行处理
### 2.4 如果count >corePoolSize,若某线程空闲时间大于keepAliveTime，线程将被终止，直到线程池中的线程数不大于corePoolSize
        如果允许为核心池中的线程设置过期时间，那么若核心池中的线程空闲时间大于keepAliveTime，线程也会被终止
## 3 什么时候会触发拒绝策略
### 当任务数不大于(maximumPoolSize+BlockingQueue.size())时，肯定不会触发