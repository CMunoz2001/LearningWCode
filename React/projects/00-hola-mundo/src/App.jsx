import './App.css'
import { TwitterFollowCard } from './TwitterFollowCard.jsx'

export function App() {
    return(
        <section className='App'>
            <TwitterFollowCard userName='gaspela'>
                Samir Millan
            </TwitterFollowCard>
            <TwitterFollowCard userName='JuanJoCH95'>
                Juan Cardona
            </TwitterFollowCard>
            <TwitterFollowCard userName='andres0191'>
                Andres
            </TwitterFollowCard>
            <TwitterFollowCard userName='Camilo2001M'>
                Camilo Muñoz
            </TwitterFollowCard>
        </section>
    )
}