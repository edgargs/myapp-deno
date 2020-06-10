import { Application, Router } from "https://deno.land/x/denotrain@v0.5.0/mod.ts";

class App{
    public express:any

    constructor(){
        this.express = new Application();
        this.mountRoutes()
    }

    private mountRoutes(): void {
        const router = new Router();
        router.get('/', (ctx) => {
            return {
                message: 'Hello World'
            }
        })
        this.express.use('/', router)
    }

}

export default new App().express